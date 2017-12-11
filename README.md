# ec2jlist
Quickly and easily list aws ec2, simpledb, S3 across all aws regions. 

## Dependencies
Java, Ant and AWS SDK

## How to run
Get the project and all dependent jars. The dependency jars are listed in the respective folders in README.txt
run "ant build" to build
run "ant run" to execute

## Sample output -- AWS regions
     [java] Total number of AWS regions = 16
     [java] ===========================================
     [java] Listing all AWS Regions this program will query
     [java] ===========================================
     [java] regions name: us-gov-west-1
     [java] regions name: ap-northeast-1
     [java] regions name: ap-northeast-2
     [java] regions name: ap-south-1
     [java] regions name: ap-southeast-1
     [java] regions name: ap-southeast-2
     [java] regions name: ca-central-1
     [java] regions name: eu-central-1
     [java] regions name: eu-west-1
     [java] regions name: eu-west-2
     [java] regions name: sa-east-1
     [java] regions name: us-east-1
     [java] regions name: us-east-2
     [java] regions name: us-west-1
     [java] regions name: us-west-2
     [java] regions name: cn-north-1
## Sample output -- ec2, simpledb, S3 recources for each region
     [java] ===========================================
     [java] Listing services in region : us-east-1
     [java] ===========================================
     [java] You have access to 6 Availability Zones.
     [java] You have 3 Amazon EC2 instance(s) running.
     [java] You have 9 Amazon SimpleDB domain(s)containing a total of 9 items.
     [java] You have 3 Amazon S3 bucket(s), containing 24 objects with a total size of 31414681 bytes.
