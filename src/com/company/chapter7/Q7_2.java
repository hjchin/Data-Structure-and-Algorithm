package com.company.chapter7;


import sun.misc.Queue;

import java.util.ArrayList;

public class Q7_2 {

    static class CallCenter{

        Queue<Call> callQueue = new Queue<>();
        ArrayList<Employee> respondents = new ArrayList<>();
        ArrayList<Employee> managers = new ArrayList<>();
        ArrayList<Employee> directors = new ArrayList<>();

        boolean dispatchCall(){
            boolean dispatchStatus = false;
            for(Employee e: respondents){
                if(e.isAvailable()){
                    assignCall(e);
                    dispatchStatus = true;
                    break;
                }
            }

            if(!dispatchStatus){
                for(Employee e: managers){
                    if(e.isAvailable()){
                        assignCall(e);
                        dispatchStatus = true;
                        break;
                    }
                }
            }

            if(!dispatchStatus){
                for(Employee e: directors){
                    if(e.isAvailable()){
                        assignCall(e);
                        dispatchStatus = true;
                        break;
                    }
                }
            }

            return dispatchStatus;
        }

        private void assignCall(Employee employee){
            try {
                Call call = callQueue.dequeue();
                call.assignee = employee;
                employee.isAvailable = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        void queueCall(Call call){
            callQueue.enqueue(call);
        }

        void addEmployee(Employee employee){
            if(employee instanceof Respondent){
                respondents.add(employee);
            }

            if(employee instanceof Manager){
                managers.add(employee);
            }

            if(employee instanceof Director){
                managers.add(employee);
            }
        }
    }

    static class Call{
        Employee assignee;
    }

    static abstract class Employee{

        private boolean isAvailable = true;

        boolean isAvailable(){
            return isAvailable;
        }
    }

    static class Respondent extends Employee{}
    static class Manager extends Employee{}
    static class Director extends Employee{}

}
