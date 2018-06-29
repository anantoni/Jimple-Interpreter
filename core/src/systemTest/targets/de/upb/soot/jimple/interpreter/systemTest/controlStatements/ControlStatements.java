package de.upb.soot.jimple.interpreter.systemTest.controlStatements;

public class ControlStatements {

    public void simple_if_else(int a, int b, int c) {
        // Simple if else
        if(a < b) {
            System.out.println("IF: " + a + " is smaller than " + b);
        }
        else if(a < c) {
            System.out.println("ELSE IF: " + a + " is smaller than " + c);
        }
        else {
            System.out.println("ELSE: " + a + " is greater than " + b + " and " +c);
        }
    }

    public void simple_switch_case(int a, int b, int c) {
        // Simple switch case
        switch (a) {
            case 10:
                System.out.println("SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
            case 20:
                System.out.println("SWITCH CASE: a is equal to " + a + "and b is equal to " + b);
            default:
                System.out.println("SWITCH DEFAULT: a is equal to " + a + " and b is equal to " + b);
        }
    }

    public void simple_while(int a, int b) {
        // Simple while
        while(a < b) {
            System.out.println("a is smaller than b");
        }
    }

    public void simple_do_while(int a, int b) {
        // Simple do while
        do {
            System.out.println("a is " + a);
        } while(a < b);
    }

    public void simple_for(int a, int b) {
        // Simple for
        for(int i = 0; i<a; i++) {
            b++;
            System.out.println("FOR: Value of b is " + b);
        }
    }

    public void nested_if_else(int a, int b, int c) {
        // Nested if else
        if(a < b) {
            System.out.println("IF: " + a + " is smaller than " + b);
            if(b < c) {
                System.out.println("NESTED IF: " + b + " is smaller than " + c);
            }
            else {
                System.out.println("NESTED IF: " + c + " is smaller than " + b);
            }
        }
        else if(a < c) {
            System.out.println("ELSE IF: " + a + " is smaller than " + c);
            if(b < c) {
                System.out.println("NESTED IF: " + b + " is smaller than " + c);
            }
            else {
                System.out.println("NESTED IF: " + c + " is smaller than " + b);
            }
        }
        else {
            System.out.println("ELSE: " + a + " is greater than " + b);
            if(b < c) {
                System.out.println("NESTED IF: " + b + " is smaller than " + c);
            }
            else {
                System.out.println("NESTED IF: " + c + " is smaller than " + b);
            }
        }
    }

    public void switch_in_if(int a, int b, int c) {
        // Nested switch in if
        if(a < b) {
            System.out.println("IF: " + a + " is smaller than " + b);
            switch (a) {
                case 10:
                    System.out.println("SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                case 20:
                    System.out.println("SWITCH CASE: a is equal to " + a + "and b is equal to " + b);
                default:
                    System.out.println("SWITCH DEFAULT: a is equal to " + a + " and b is equal to " + b);
            }
        }
        else if(a < c) {
            System.out.println("ELSE IF: " + a + " is smaller than " + c);
            switch (a) {
                case 10:
                    System.out.println("SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                case 20:
                    System.out.println("SWITCH CASE: a is equal to " + a + "and b is equal to " + b);
                default:
                    System.out.println("SWITCH DEFAULT: a is equal to " + a + " and b is equal to " + b);
            }
        }
        else {
            System.out.println("ELSE: " + a + " is greater than " + b);
            switch (a) {
                case 10:
                    System.out.println("SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                case 20:
                    System.out.println("SWITCH CASE: a is equal to " + a + "and b is equal to " + b);
                default:
                    System.out.println("SWITCH DEFAULT: a is equal to " + a + " and b is equal to " + b);
            }
        }
    }

    public void nested_while_in_if(int a, int b, int c) {
        // Nested while in if
        if(a < b) {
            System.out.println("IF: " + a + " is smaller than " + b);
            while(a < b) {
                System.out.println("NESTED WHILE: " + a + " is smaller than " + b);
            }
        }
        else if(a < c) {
            System.out.println("ELSE IF: " + a + " is smaller than " + c);
            while(a < b) {
                System.out.println("NESTED WHILE: " + a + " is smaller than " + b);
            }
        }
        else {
            System.out.println("ELSE: " + a + " is greater than " + b + " and " +c);
            while(a < b) {
                System.out.println("NESTED WHILE: " + a + " is smaller than " + b);
            }
        }
    }

    public void nested_for_in_if(int a, int b, int c) {
        // Nested for in if
        if(a < b) {
            System.out.println("IF: " + a + " is smaller than " + b);
            for(int i = 0; i<a; i++) {
                b++;
                System.out.println("FOR: Value of b is " + b);
            }
        }
        else if(a < c) {
            System.out.println("ELSE IF: " + a + " is smaller than " + c);
            for(int i = 0; i<a; i++) {
                b++;
                System.out.println("FOR: Value of b is " + b);
            }
        }
        else {
            System.out.println("ELSE: " + a + " is greater than " + b + " and " +c);
            for(int i = 0; i<a; i++) {
                b++;
                System.out.println("FOR: Value of b is " + b);
            }
        }
    }

    public void nested_switch_in_switch(int a, int b, int c) {
        // Nested switch in switch
        switch(a) {
            case 10:
                System.out.println("SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                switch(b) {
                    case 5:
                        System.out.println("NESTED SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                    case 10:
                        System.out.println("NESTED SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                    default:
                        System.out.println("NESTED SWITCH DEFAULT: a is equal to " + a + " and b is equal to " + b);
                }
            case 20:
                System.out.println("SWITCH CASE: a is equal to " + a + "and b is equal to " + b);
                switch(b) {
                    case 5:
                        System.out.println("NESTED SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                    case 10:
                        System.out.println("NESTED SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                    default:
                        System.out.println("NESTED SWITCH DEFAULT: a is equal to " + a + " and b is equal to " + b);
                }
            default:
                System.out.println("SWITCH DEFAULT: a is equal to " + a + " and b is equal to " + b);
                switch(b) {
                    case 5:
                        System.out.println("NESTED SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                    case 10:
                        System.out.println("NESTED SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                    default:
                        System.out.println("NESTED SWITCH DEFAULT: a is equal to " + a + " and b is equal to " + b);
                }
        }
    }

    public void nested_if_in_switch(int a, int b, int c) {
        switch (a) {
            case 10:
                System.out.println("SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                if(a < b) {
                    System.out.println("IF: " + a + " is smaller than " + b);
                }
                else if(a < c) {
                    System.out.println("ELSE IF: " + a + " is smaller than " + c);
                }
                else {
                    System.out.println("ELSE: " + a + " is greater than " + b + " and " +c);
                }

            case 20:
                System.out.println("SWITCH CASE: a is equal to " + a + "and b is equal to " + b);
                if(a < b) {
                    System.out.println("IF: " + a + " is smaller than " + b);
                }
                else if(a < c) {
                    System.out.println("ELSE IF: " + a + " is smaller than " + c);
                }
                else {
                    System.out.println("ELSE: " + a + " is greater than " + b + " and " +c);
                }
            default:
                System.out.println("SWITCH DEFAULT: a is equal to " + a + " and b is equal to " + b);
                if(a < b) {
                    System.out.println("IF: " + a + " is smaller than " + b);
                }
                else if(a < c) {
                    System.out.println("ELSE IF: " + a + " is smaller than " + c);
                }
                else {
                    System.out.println("ELSE: " + a + " is greater than " + b + " and " +c);
                }
        }
    }

    public void nested_while_in_switch(int a, int b, int c) {
        // Nested while in switch
        switch (a) {
            case 10:
                System.out.println("SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                while(a < b) {
                    System.out.println("a is smaller than b");
                }
            case 20:
                System.out.println("SWITCH CASE: a is equal to " + a + "and b is equal to " + b);
                while(a < b) {
                    System.out.println("a is smaller than b");
                }
            default:
                System.out.println("SWITCH DEFAULT: a is equal to " + a + " and b is equal to " + b);
                while(a < b) {
                    System.out.println("a is smaller than b");
                }
        }
    }

    public void nested_for_in_switch(int a,int b, int c) {
        // Nested for in switch
        switch (a) {
            case 10:
                System.out.println("SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                for(int i = 0; i<a; i++) {
                    b++;
                    System.out.println("FOR: Value of b is " + b);
                }
            case 20:
                System.out.println("SWITCH CASE: a is equal to " + a + "and b is equal to " + b);
                for(int i = 0; i<a; i++) {
                    b++;
                    System.out.println("FOR: Value of b is " + b);
                }
            default:
                System.out.println("SWITCH DEFAULT: a is equal to " + a + " and b is equal to " + b);
                for(int i = 0; i<a; i++) {
                    b++;
                    System.out.println("FOR: Value of b is " + b);
                }
        }
    }

    public void nested_while_in_while(int a, int b, int c) {
        // Nested while
        while(a < b) {
            System.out.println("a is smaller than b");
            while(b < c) {
                System.out.println("b is smaller than c");
            }
        }
    }

    public void nested_if_in_while(int a, int b, int c) {
        // Nested if in while
        while(a < b) {
            System.out.println("a is smaller than b");
            if(a < b) {
                System.out.println("IF: " + a + " is smaller than " + b);
            }
            else if(a < c) {
                System.out.println("ELSE IF: " + a + " is smaller than " + c);
            }
            else {
                System.out.println("ELSE: " + a + " is greater than " + b + " and " +c);
            }
        }
    }

    public void nested_switch_in_while(int a, int b, int c) {
        // Nested switch in while
        while(a < b) {
            System.out.println("a is smaller than b");
            switch (a) {
                case 10:
                    System.out.println("SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                case 20:
                    System.out.println("SWITCH CASE: a is equal to " + a + "and b is equal to " + b);
                default:
                    System.out.println("SWITCH DEFAULT: a is equal to " + a + " and b is equal to " + b);
            }
        }
    }

    public void nested_for_in_while(int a, int b, int c) {
        // Nested for in while
        while(a < b) {
            System.out.println("a is smaller than b");
            for(int i = 0; i<a; i++) {
                b++;
                System.out.println("FOR: Value of b is " + b);
            }
        }
    }

    public void nested_for_in_for(int a, int b) {
        // Nested for in for
        for(int i = 0; i<a; i++) {
            b++;
            System.out.println("FOR: Value of b is " + b);
            for(int j = 0; j<i; j++) {
                b++;
                System.out.println("NESTED FOR: Value of b is " + b);
            }
        }
    }

    public void nested_if_in_for(int a, int b, int c) {
        // Nested if in for
        for(int i = 0; i<a; i++) {
            b++;
            System.out.println("FOR: Value of b is " + b);
            if(a < b) {
                System.out.println("IF: " + a + " is smaller than " + b);
            }
            else if(a < c) {
                System.out.println("ELSE IF: " + a + " is smaller than " + c);
            }
            else {
                System.out.println("ELSE: " + a + " is greater than " + b + " and " +c);
            }
        }
    }

    public void nested_switch_in_for(int a, int b, int c) {
        // Nested switch in for
        for(int i = 0; i<a; i++) {
            b++;
            System.out.println("FOR: Value of b is " + b);
            switch (a) {
                case 10:
                    System.out.println("SWITCH CASE: a is equal to " + a + " and b is equal to " + b);
                case 20:
                    System.out.println("SWITCH CASE: a is equal to " + a + "and b is equal to " + b);
                default:
                    System.out.println("SWITCH DEFAULT: a is equal to " + a + " and b is equal to " + b);
            }
        }
    }

    public void nested_while_in_for(int a, int b, int c) {
        // Nested while in for
        for(int i = 0; i<a; i++) {
            b++;
            System.out.println("FOR: Value of b is " + b);
            while(a < b) {
                System.out.println("NESTED WHILE: a is smaller than b");
            }
        }
    }
}
