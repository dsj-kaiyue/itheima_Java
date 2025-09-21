package com.itheima.demo;

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies){
        this.movies = movies;
    }


    public void printAllMovie() {
        for (Movie movie:this.movies){
            System.out.println(movie.getId()+"\t"+movie.getName()+"\t");
        }
    }


    public void searchMovieById() {
        Scanner sc=new Scanner(System.in);
        int id= sc.nextInt();

        for (Movie movie:this.movies){
            if (movie.getId()==id){
                System.out.println(movie.getName());
                return ;
            }
        }
        System.out.println("无此电影");
    }
}
