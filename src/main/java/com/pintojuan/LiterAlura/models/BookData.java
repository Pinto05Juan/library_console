package com.pintojuan.LiterAlura.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BookData(
        @JsonAlias("title") String title,
        @JsonAlias("languages") String language,
        @JsonAlias("download_count") double countDownloads,
        @JsonAlias("authors") List<Author> authors
) {
}
