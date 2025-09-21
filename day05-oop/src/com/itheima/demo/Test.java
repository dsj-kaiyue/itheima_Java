package com.itheima.demo;

public class Test {
    public static void main(String[] args) {
            Movie[] movies=new Movie[5];
            //
            movies[0]=new Movie(1,"唐顿庄园",9.5,"罗宾·怀特");
            movies[1]=new Movie(2,"唐顿庄园",9.5,"罗宾·怀特");
            movies[2]=new Movie(3,"唐顿庄园",9.5,"罗宾·怀特");
            movies[3]=new Movie(4,"唐顿庄园",9.5,"罗宾·怀特");
            movies[4]=new Movie(5,"唐顿庄园",9.5,"罗宾·怀特");


            MovieOperator movieOperator=new MovieOperator(movies);

            movieOperator.printAllMovie();
            movieOperator.searchMovieById();

    }
}
