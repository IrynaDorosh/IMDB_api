package com.dorosh.omdbtest.controllers;

import com.dorosh.omdbtest.TestData.TData;
import com.dorosh.omdbtest.models.Movie;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MovieController {
    private RequestSpecification requestSpecification;
    private String API_KEY = "apikey";


    public MovieController() {
        RestAssured.defaultParser = Parser.JSON;
    }

    private RequestSpecBuilder getBaseSpecificationBuilder(ContentType contentType) {
        return new RequestSpecBuilder()
                .setBaseUri("http://www.omdbapi.com")
                .addQueryParam(API_KEY, TData.API_KEY_VALUE)
                .setContentType(contentType)
                .log(LogDetail.ALL);
    }


    public Movie getMovieByTitle(String title) {
        return getMovieByAllParams(title, null, null, null);
    }


    public Movie getMovieByTitleAndYear(String title, Integer year) {
        return getMovieByAllParams(title, year, null, null);
    }


    public Movie getMovieByAllParams(String title, Integer year, String plotType, ContentType contentType) {
        if (title == null) {
            return null; // TODO:
        }

        RequestSpecBuilder requestSpecBuilder = getBaseSpecificationBuilder(contentType == null ? ContentType.JSON : ContentType.XML);

        requestSpecBuilder.addQueryParam("t", title);
        if (year != null) {
            requestSpecBuilder.addQueryParam("y", year);
        }
        if ("full".equals(plotType)) {
            requestSpecBuilder.addQueryParam("plot", "full");
        }
        if (ContentType.XML == contentType) {
            requestSpecBuilder.addQueryParam("r", "XML");
        }

        requestSpecification = requestSpecBuilder.build();
        Response response = RestAssured.given(requestSpecification).get();
        if (response.statusCode() == 200) {
            return response.as(Movie.class);
        } else {
            return null; // TODO:
        }
    }

}
