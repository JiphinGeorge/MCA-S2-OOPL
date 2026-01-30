//1.Create a class CPU with attribute price. Create an inner class Processor (no. of cores, manufacturer) and
//a static nested class RAM (memory, manufacturer) inside CPU. Create an object of CPU and print details of its processor and RAM.

class prgm_4_CPU {
    int price;

    class Processor {
        int noOfCores;
        String manufacturer;

        Processor(int noOfCores, String manufacturer) {
            this.noOfCores = noOfCores;
            this.manufacturer = manufacturer;
        }

        void displayProcessorDetails() {
            System.out.println("Manufacturer is " + manufacturer + "total number of cores is " + noOfCores);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacture) {
            this.memory = memory;
            this.manufacturer = manufacture;
        }

        void displayRAMDetails() {
            System.out.println("Manufacturer is " + manufacturer + " total memory is " + memory);
        }

    }

    prgm_4_CPU(int price) {
        this.price = price;
    }

    void displayPrice() {
        System.out.println("Price of CPU is " + price);
    }
    
    public static void main(String[]args)
    {
        prgm_4_CPU cpuobj = new prgm_4_CPU(5000);
        prgm_4_CPU.Processor processorobj = cpuobj.new Processor(16,"Intel");
        prgm_4_CPU.RAM ramobj = new prgm_4_CPU.RAM(32,"Samsung");
        cpuobj.displayPrice();
        processorobj.displayProcessorDetails();
        ramobj.displayRAMDetails();

    }
}

