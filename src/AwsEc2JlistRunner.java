/*
 * Copyright 2010-2017 Innofoundry, LLC
 *
 * Innofoundry LLC licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

import java.util.List;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.RegionUtils;

public class AwsEc2JlistRunner {

	/*
	 * Before running the code:
	 *      Fill in your AWS access credentials in the provided credentials
	 *      file template, and be sure to move the file to the default location
	 *      (~/.aws/credentials) 
	 */
	
    public static void main(String[] args) throws Exception {

    	
    	/**
         * Get the list AWS regions
         */
    	
        List<Region> b = RegionUtils.getRegions();
        
        System.out.println("Total number of AWS regions = " + b.size());        
        System.out.println("===========================================");
        System.out.println("Listing all AWS Regions this program will query");
        System.out.println("===========================================");
        
    	/**
         * Listing all AWS regions
         */
        
        for (int i=0; i<b.size(); i++)
        {
        	Region r = b.get(i);
        	System.out.println("regions name: " + r.getName());
        }
        
    	/**
         * Listing all EC2, SimpleDB and S3 services across all AWS 
         * regions
         */
        
       
        for (int i=0; i<b.size(); i++)
        {
        	Region r = b.get(i);
            System.out.println("===========================================");
            System.out.println("Listing services in region : " + r.getName());
            System.out.println("===========================================");
            
            AwsEc2Jlist jList = new AwsEc2Jlist();
        	jList.init(r);
        	jList.listEC2();
        	jList.listSimpleDB();
        	jList.listS3();
        
        }
        
        System.out.println("===========================================");
        System.out.println("End of execution");
        System.out.println("===========================================");
        
}
   
}
