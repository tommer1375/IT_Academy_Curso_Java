

    private String objectOne;
    private String objectTwo;
    private String objectThree;

   public NoGenericMethods(String objectOne, String objectTwo, String objectThree) {
        this.objectOne = objectOne;
        this.objectTwo = objectTwo;
        this.objectThree = objectThree;

    }

    public String getObjectOne() {
        return objectOne;
    }

    public String getObjectTwo() {
        return objectTwo;
    }

    public String getObjectThree() {
        return objectThree;
    }

    public void setObjectOne(String newVariable) {
        objectOne = newVariable;

    }

    public void setObjectTwo(String newVariable) {
        objectTwo = newVariable;
    }

    public void setObjectThree(String newVariable) {
        objectThree = newVariable;
    }
}


