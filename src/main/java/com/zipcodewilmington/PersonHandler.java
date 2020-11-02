package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;// create a `counter`
        while(counter < personArray.length) { // while `counter` is less than length of array
            // begin loop

            Person currentPerson = personArray[counter] ;   // use `counter` to identify the `current Person` in the array
            String stringRepresentation = currentPerson.toString();   // get `string Representation` of `currentPerson`
            result += stringRepresentation;   // append `stringRepresentation` to `result` variable
            counter++;
        }  // end loop
            
        return result;    //return result    
    }



    public String forLoop() {
        String result = "";
        // identify initial value -- i = 0
        // identify terminal condition -- initialValue < personArray.length
        // identify increment -- i++

        // use the above clauses to declare for-loop signature
        for (int i = 0; i < personArray.length; i++) {    // begin loop
            Person currentPerson = personArray[i];// use `counter` to identify the `current Person` in the array
            String stringRepresentation = currentPerson.toString();// get `string Representation` of `currentPerson`
            result += stringRepresentation;// append `stringRepresentation` to `result` variable
        }// end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        for (Person currentPerson : personArray) {// use the above discoveries to declare for-each-loop signature
            // begin loop
            String stringRepresentation = currentPerson.toString();// get `string Representation` of `currentPerson`
            result += stringRepresentation;    // append `stringRepresentation` to `result` variable
        }// end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
