package com.example.demo6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareFims {
    public void maxAge(List<FilmDescription> list) {


        list.sort(new Comparator<FilmDescription>() {
            @Override
            public int compare(FilmDescription o1, FilmDescription o2) {
                if (o1.getAge() == o2.getAge()) return 0;
                else if (o1.getAge() < o2.getAge()) return 1;
                else return -1;
            }
        });
    }

    public void minAge(List<FilmDescription> list) {
        list.sort(new Comparator<FilmDescription>() {
            @Override
            public int compare(FilmDescription o1, FilmDescription o2) {
                if (o1.getAge() == o2.getAge()) {
                    return 0;
                } else if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else return -1;
            }
        });
    }

    public void maxRating(List<FilmDescription> list) {
        list.sort(new Comparator<FilmDescription>() {
            @Override
            public int compare(FilmDescription o1, FilmDescription o2) {
                if (o1.getRating() == o2.getAge()) {
                    return 0;
                } else if (o1.getRating() < o2.getRating()) {
                    return 1;
                } else return -1;
            }
        });
    }

    public void minRating(List<FilmDescription> list) {
        list.sort(new Comparator<FilmDescription>() {
            @Override
            public int compare(FilmDescription o1, FilmDescription o2) {
                if (o1.getRating() == o2.getRating()) {
                    return 0;
                } else if (o1.getRating() > o2.getRating()) {
                    return 1;
                } else return -1;
            }
        });
    }

    public void maxRelYear(List<FilmDescription> list) {
        list.sort(new Comparator<FilmDescription>() {
            @Override
            public int compare(FilmDescription o1, FilmDescription o2) {
                if (o1.getReliseYear() == o2.getReliseYear()) {
                    return 0;
                } else if (o1.getReliseYear() < o2.getReliseYear()) {
                    return 1;
                } else return -1;
            }
        });
    }

    public void minRelYear(List<FilmDescription> list) {
        list.sort(new Comparator<FilmDescription>() {
            @Override
            public int compare(FilmDescription o1, FilmDescription o2) {
                if (o1.getReliseYear() == o2.getReliseYear()) {
                    return 0;
                } else if (o1.getReliseYear() > o2.getReliseYear()) {
                    return 1;
                } else return -1;
            }
        });
    }
    public void maxTime(List<FilmDescription> list){
        list.sort(new Comparator<FilmDescription>() {
            @Override
            public int compare(FilmDescription o1, FilmDescription o2) {
                if (o1.getTimeMin() == o2.getTimeMin()){return 0;}
                else if (o1.getTimeMin() > o2.getTimeMin()) {return 1;}
                else return -1;
            }
        });
    }
    public void minTime(List<FilmDescription> list){
        list.sort(new Comparator<FilmDescription>() {
            @Override
            public int compare(FilmDescription o1, FilmDescription o2) {
                if (o1.getTimeMin() == o2.getTimeMin()){return 0;}
                else if (o1.getTimeMin() > o2.getTimeMin()) {return 1;}
                else return -1;
            }
        });
    }
}
