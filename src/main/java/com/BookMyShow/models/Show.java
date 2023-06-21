package com.BookMyShow.models;

import java.sql.Date;
import java.util.List;

public class Show {
    private Movie movie;
    private Date startTime;
    private Date endTime;
    private Theatre theatre;
    private List<Feature> features;
}
