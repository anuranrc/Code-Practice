package com.arc.randprob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Anuran RC
 */
public class RandomAssignmentWithNonUniformProb {

    public static void main(String[] args) {
        String str= "x:3 y:4 z:1";
        int callNumber = 100;

        System.out.println(str);
        String[] arr = str.split(" ");
        int totalCapacity =0;

        // For displaying the server capacities
        List<Integer> servers = new ArrayList<>();
        System.out.println("Server Capacities: \n" );
        for(String x: arr){
            char serverName = x.charAt(0);
            int serverCap = (x.charAt(2)-'0');
            System.out.println(serverName + " "+ serverCap);
            //int serverCap = (x.charAt(2) - '0');
            servers.add(serverCap);
            totalCapacity += serverCap;
        }
        System.out.println("\nTotal Capacity: "+totalCapacity+ "\n");

        int[] server = new int[servers.size()];
        int cumRatio =0;
        System.out.println("\nRatio percentage capacity distribution: "+ "\n");
        for(int i=0; i< server.length; i++){
            double temp = (servers.get(i)*1.0 / totalCapacity)*100;
            int ratioPercent= (int)temp;
            System.out.println(ratioPercent);
            cumRatio += ratioPercent;
            server[i] = cumRatio;
        }

        //int[] dist = new int[100];
        System.out.println("\nCumulative capacity distribution:  " +"\n");
        for(int i=0; i< server.length; i++){
            int temp = server[i];
            System.out.println(temp);
        }

        int[] result = new int[100];

        for(int i =0; i< callNumber; i++){
            int temp = (int)(Math.random()*100);
            System.out.println(temp);
            int j =0;

            while (j< server.length){
                if(temp <server[j]) {
                    result[i] = j;
                    System.out.println("Chosen Server" +j);
                    break;
                }
                else j++;
            }
        }

        System.out.println("\nDistributed Percentage in result");
        int[] res = new int[server.length];
        for(int ele: result){
//            for(int j =0; j< server.length; j++){
//                if(ele == server[j]){
                    res[ele] += 1;
//                }
        }

        for(int r:res){
            System.out.println(r);

        }
    }


}
