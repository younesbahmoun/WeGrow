<bean id="departmentRepository"
class="ma.wegrow.repository.DepartmentRepository"/>

<bean id="departmentService"
class="ma.wegrow.service.DepartmentService">
<constructor-arg ref="departmentRepository"/>
</bean>

docker exec -it spring-postgres psql -U postgres -d wegrow







sudo cp target/wegrow-api.war /var/lib/tomcat10/webapps/
sudo chown tomcat:tomcat /var/lib/tomcat10/webapps/wegrow-api.war
sudo systemctl restart tomcat10


psql -h localhost -p 5433 -U postgres -d wegrow