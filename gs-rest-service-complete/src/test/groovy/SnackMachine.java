public class SnackMachine {
    private int[] Almonds = new int[5];
    private int[] Cheetos = new int[5];
    private int[] Snickers = new int[5];
    private int[] Fritos = new int[5];
    private int[] Crunchbar = new int[5];
    private int TotalSpaces = 0;

    public int getTotalCompartments() {
        return Almonds.length + Cheetos.length + Snickers.length + Fritos.length + Crunchbar.length;
    }

    public void addProduct() {
        for (int i = 0; i < 5; i++
                ) {
            Almonds[i] = 10;
            Cheetos[i] = 10;
            Snickers[i] = 10;
            Fritos[i] = 10;
            Crunchbar[i] = 10;
        }
    }

    public int getSpaces() {
        return getTotalCompartments() * 10;
    }
//    NOTE !!!
//    The dispense method clearly violates the DO NOT REAPEAT YOURSELF principle.  This method can be improved by refactoring.  It was written poorly and using a better implementation is open for discussion.


    public String dispense(String product, int compartment) {
        String productBought = "";
        switch (product) {
            case "Almonds":
                if (Almonds[compartment] > 0) {
                    Almonds[compartment] -= 1;
                    productBought = "Almonds";
                    System.out.println("Purchased" +" " + productBought);
                    System.out.println(Almonds[compartment] +" " + productBought + " left in compartment" +  ".");
                    break;
                } else {
                    productBought = "empty";
                    System.out.println(productBought);
                    break;
                }
            case "Cheetos":
                if (Cheetos[compartment] > 0) {
                    Cheetos[compartment] -= 1;
                    productBought = "Cheetos";
                    System.out.println("Purchased" +" " + productBought +  ".");
                    System.out.println(Cheetos[compartment] +" " + productBought + " left in compartment" +  ".");
                    break;
                } else {
                    productBought = "empty";
                    System.out.println(productBought);
                    break;
                }
            case "Snickers":
                if (Snickers[compartment] > 0) {
                    Snickers[compartment] -= 1;
                    productBought = "Snickers";
                    System.out.println("Purchased" +" " + productBought +  ".");
                    System.out.println(Snickers[compartment] +" " + productBought + " left in compartment" +  ".");
                    break;
                } else {
                    productBought = "empty";
                    System.out.println(productBought);
                    break;
                }
            case "Fritos":
                if (Fritos[compartment] > 0) {
                    Fritos[compartment] -= 1;
                    productBought = "Fritos";
                    System.out.println("Purchased" +" " + productBought +  ".");
                    System.out.println(Fritos[compartment] +" " + productBought + " left in compartment" +  ".");
                    break;
                } else {
                    productBought = "empty";
                    System.out.println(productBought);
                    break;
                }
            case "Crunchbar":
                if (Crunchbar[compartment] > 0) {
                    Crunchbar[compartment] -= 1;
                    productBought = "Crunchbar";
                    System.out.println("Purchased" +" " + productBought +  ".");
                    System.out.println(Crunchbar[compartment] +" " + productBought + " left in compartment" +  ".");
                    break;
                } else {
                    productBought = "empty";
                    System.out.println(productBought);
                    break;
                }
        }
        return productBought;
    }


}

