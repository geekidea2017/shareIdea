# Share Idea Java Backend

# Mongo DB installation steps and run in command prompt
---------------------------------------------------------------------

1. Downlaod Mongodb msi or Zip file from mongodb web site
2. open CMD in windows as administrator to the c:\program file\mongodb..\3.4\bin folder
3. Create a directory d:\data as per available directory
4. Lets run the below command  mongod --dbpath d:\data
5. open new command propmt [sufficent privellages (admin)]
6. Run command form installed mongodb directory bin folder c:\start mongo.exe 
7. dont close the shell[any of command promt as well] as in this we will create /delete/insert our databse operations
8. Lets perform basic operation
	a) show databases b) show current databse c) creation of collection / inserting data into it (name will be test) d) show data of collection
 9. in Mongo.exe command prompt lets do some basic operation
	a. dbs
	b. show dbs
	c. db
	d. db.test.insert({name:"geek"})
	c. db.test.find()  

https://stackoverflow.com/questions/2404742/how-to-install-mongodb-on-windows


# Swagger 2 UI Integrated 
_____________________________

Swagger UI integrated In the application using Swagger2. Its integrated in SwaggerConfig.java file. For swagger Do not use @EnableWebMvc  Annotation in your application...



