package com.example.springdatajdbcsample;

import com.example.springdatajdbcsample.entity.Member;
import com.example.springdatajdbcsample.repository.MemberCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJdbcSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJdbcSampleApplication.class, args).
                getBean(SpringDataJdbcSampleApplication.class).execute();

        SpringDataJdbcSampleApplication springApplication = new SpringDataJdbcSampleApplication();
        //springApplication.hello();

    }

    @Autowired
    MemberCrudRepository repository;

    private void execute() {

        executeInsert();
        executeSelect();

    }

    private void executeInsert() {

        Member member = new Member(null,"花子");
        member = repository.save(member);

        System.out.println("登録したデータ" + member);



    }

    private void executeSelect() {

        System.out.println("========全件取得します==============");

        Iterable<Member> members = repository.findAll();
        for (Member member : members){
            System.out.println(member);
        }
    }

    private void hello(){
        System.out.println("==================Hello world==================");
    }

}
