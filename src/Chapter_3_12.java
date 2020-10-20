public class Chapter_3_12 {
        private String Part_Number;
        private String Part_Description;
        private int Quantity;
        private double Peice;

        public Chapter_3_12(String Part_Number,String Part_Description,double Peice, int Quantity){
            setPart_Number(Part_Number);
            setPart_Description(Part_Description);
            if (Peice>0.0){
                setPeice(Peice);
            }
            if(Quantity>0)
            {
                setQuantity(Quantity);
            }
        }
    public String getPart_Number() {
        return Part_Number;
    }

    public void setPart_Number(String part_Number) {
        Part_Number = part_Number;
    }

    public String getPart_Description() {
        return Part_Description;
    }

    public void setPart_Description(String part_Description) {
        Part_Description = part_Description;
    }

    public double getPeice() {
        return Peice;
    }

    public void setPeice(double peice) {
        Peice = peice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
    public  double getInvoiceAmount()
    {
        return  Quantity*Peice;
    }


}
