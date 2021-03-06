package com.era.supercar;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App {

	public static void main(String[] args) throws IOException {

        SpringApplication.run(App.class, args);
        
		System.out.println( "Hello World!" );

        Thread cloud = new Thread(new ServerWorker());
        cloud.run();

		/*
        ServerSocket server = new ServerSocket(330);

        while(true)
        {
            Socket client = server.accept();

            Thread clientWorker = new Thread( new ClientWorker(client) );

            clientWorker.run();
		}
		*/
	}
}
