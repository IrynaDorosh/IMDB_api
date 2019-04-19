package com.dorosh.omdbtest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Movie {

    @JsonProperty("Title")
    private String title;
    @JsonProperty("Year")
    private String year;
    @JsonProperty("Rated")
    private String rated;
    @JsonProperty("Released")
    private String released;
    @JsonProperty("Runtime")
    private String runtime;
    @JsonProperty("Genre")
    private String genre;
    @JsonProperty("Director")
    private String director;
    @JsonProperty("Writer")
    private String writer;
    @JsonProperty("Actors")
    private String actors;
    @JsonProperty("Plot")
    private String plot;
    @JsonProperty("Language")
    private String language;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Awards")
    private String awards;
    @JsonProperty("Poster")
    private String poster;
    @JsonProperty("Ratings")
    private List<Rating> ratings = null;
    @JsonProperty("Metascore")
    private String metascore;
    @JsonProperty("imdbRating")
    private String imdbRating;
    @JsonProperty("imdbVotes")
    private String imdbVotes;
    @JsonProperty("imdbID")
    private String imdbID;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("DVD")
    private String dVD;
    @JsonProperty("BoxOffice")
    private String boxOffice;
    @JsonProperty("Production")
    private String production;
    @JsonProperty("Website")
    private String website;
    @JsonProperty("Response")
    private String response;
    @JsonProperty("Error")
    private String error;

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("Year")
    public String getYear() {
        return year;
    }

    @JsonProperty("Year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("Rated")
    public String getRated() {
        return rated;
    }

    @JsonProperty("Rated")
    public void setRated(String rated) {
        this.rated = rated;
    }

    @JsonProperty("Released")
    public String getReleased() {
        return released;
    }

    @JsonProperty("Released")
    public void setReleased(String released) {
        this.released = released;
    }

    @JsonProperty("Runtime")
    public String getRuntime() {
        return runtime;
    }

    @JsonProperty("Runtime")
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    @JsonProperty("Genre")
    public String getGenre() {
        return genre;
    }

    @JsonProperty("Genre")
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @JsonProperty("Director")
    public String getDirector() {
        return director;
    }

    @JsonProperty("Director")
    public void setDirector(String director) {
        this.director = director;
    }

    @JsonProperty("Writer")
    public String getWriter() {
        return writer;
    }

    @JsonProperty("Writer")
    public void setWriter(String writer) {
        this.writer = writer;
    }

    @JsonProperty("Actors")
    public String getActors() {
        return actors;
    }

    @JsonProperty("Actors")
    public void setActors(String actors) {
        this.actors = actors;
    }

    @JsonProperty("Plot")
    public String getPlot() {
        return plot;
    }

    @JsonProperty("Plot")
    public void setPlot(String plot) {
        this.plot = plot;
    }

    @JsonProperty("Language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("Language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("Awards")
    public String getAwards() {
        return awards;
    }

    @JsonProperty("Awards")
    public void setAwards(String awards) {
        this.awards = awards;
    }

    @JsonProperty("Poster")
    public String getPoster() {
        return poster;
    }

    @JsonProperty("Poster")
    public void setPoster(String poster) {
        this.poster = poster;
    }

    @JsonProperty("Ratings")
    public List<Rating> getRatings() {
        return ratings;
    }

    @JsonProperty("Ratings")
    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    @JsonProperty("Metascore")
    public String getMetascore() {
        return metascore;
    }

    @JsonProperty("Metascore")
    public void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    @JsonProperty("imdbRating")
    public String getImdbRating() {
        return imdbRating;
    }

    @JsonProperty("imdbRating")
    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    @JsonProperty("imdbVotes")
    public String getImdbVotes() {
        return imdbVotes;
    }

    @JsonProperty("imdbVotes")
    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    @JsonProperty("imdbID")
    public String getImdbID() {
        return imdbID;
    }

    @JsonProperty("imdbID")
    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("DVD")
    public String getDVD() {
        return dVD;
    }

    @JsonProperty("DVD")
    public void setDVD(String dVD) {
        this.dVD = dVD;
    }

    @JsonProperty("BoxOffice")
    public String getBoxOffice() {
        return boxOffice;
    }

    @JsonProperty("BoxOffice")
    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    @JsonProperty("Production")
    public String getProduction() {
        return production;
    }

    @JsonProperty("Production")
    public void setProduction(String production) {
        this.production = production;
    }

    @JsonProperty("Website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("Website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("Response")
    public String getResponse() {
        return response;
    }

    @JsonProperty("Response")
    public void setResponse(String response) {
        this.response = response;
    }

    @JsonProperty("Error")
    public String getError() {
        return error;
    }

    @JsonProperty("Error")
    public void setError(String error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) &&
                Objects.equals(year, movie.year) &&
                Objects.equals(rated, movie.rated) &&
                Objects.equals(released, movie.released) &&
                Objects.equals(runtime, movie.runtime) &&
                Objects.equals(genre, movie.genre) &&
                Objects.equals(director, movie.director) &&
                Objects.equals(writer, movie.writer) &&
                Objects.equals(actors, movie.actors) &&
                Objects.equals(plot, movie.plot) &&
                Objects.equals(language, movie.language) &&
                Objects.equals(country, movie.country) &&
                Objects.equals(awards, movie.awards) &&
                Objects.equals(poster, movie.poster) &&
                Objects.equals(ratings, movie.ratings) &&
                Objects.equals(metascore, movie.metascore) &&
                Objects.equals(imdbRating, movie.imdbRating) &&
                Objects.equals(imdbVotes, movie.imdbVotes) &&
                Objects.equals(imdbID, movie.imdbID) &&
                Objects.equals(type, movie.type) &&
                Objects.equals(dVD, movie.dVD) &&
                Objects.equals(boxOffice, movie.boxOffice) &&
                Objects.equals(production, movie.production) &&
                Objects.equals(website, movie.website) &&
                Objects.equals(response, movie.response) &&
                Objects.equals(error, movie.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, rated, released, runtime, genre, director, writer, actors, plot, language, country, awards, poster, ratings, metascore, imdbRating, imdbVotes, imdbID, type, dVD, boxOffice, production, website, response, error);
    }
}
