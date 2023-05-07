This project was done using MapReduce and Hive.

The raw data can be found in my HDFS, in "dataset.csv" in the "final_project" directory.

Everything is in the "Submission" directory. Within that directory are the following:

ana_code: Directory that contains code and commands for data analysis.

data_ingest: Directory that contains code and commands for data ingestion.

etl_code: Directory that contains code and commands for data cleaning. The clean.jar drops all columns I do not need.

profiling_code: Directory that contains code and commands for data profiling. countRecs.jar counts the number of records in the raw dataset. delimiter.jar finds a delimiter I can use when I rewrite the file by making sure it is not already present in any of the values in the columns of importance. I ended going with ";" as my delimiter.

screenshots: Screenshots of me running the project.

opencsv: Jar file I used to help me process the raw data as there were irregularities.

All the results of the MapReduce runs can be found in the "final_project" directory in my HDFS. They are all stored in labeled directories. All the results of the Hive commands are in my jz3943_nyu_edu database. The tables relevant to the project are

final_project_1: First iteration of the table.

final_project_2: Second iteration of the table.

final_project_3: Final iteration of the table.

time_telling: Generated table with month and time of day. Splits up time columns.

year_telling: Generated table with year. Splits up time columns.

For how to run my project, check out the "screenshots" directory mentioned above.