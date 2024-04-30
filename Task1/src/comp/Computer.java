package comp;

import comp.harddisc.HardDisc;
import comp.harddisc.HardDiscTypes;
import comp.keyboard.Illumination;
import comp.keyboard.Keyboard;
import comp.keyboard.KeyboardTypes;
import comp.processor.Frequency;
import comp.processor.NumberOfCores;
import comp.processor.Procesor;
import comp.processor.ProcessorManufacturer;
import comp.ram.RAMType;
import comp.ram.Ram;
import comp.screen.Screen;
import comp.screen.ScreenTypes;

public class Computer {
    private Procesor processor;
    private Ram ram;
    private HardDisc hardDisc;
    private Screen screen;
    private Keyboard keyboard;

    private final String VENDOR = "Thaiwan";

    public Computer(Procesor processor, Ram ram, HardDisc hardDisc, Screen screen, Keyboard keyboard) {
        this.processor = processor;
        this.ram = ram;
        this.hardDisc = hardDisc;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public void weightCount() {
        System.out.println("Вес вашего компьютера: " + processor.getWeight() + ram.getWeight() +
                hardDisc.getWeight() + screen.getWeight() + keyboard.getWeight());
    }

    @Override
    public String toString() {
        return "ComputerInfo:\n" +
                "processor = " + processor +
                ", ram = " + ram +
                ", hardDisc = " + hardDisc +
                ", screen = " + screen +
                ", keyboard = " + keyboard +
                ", VENDOR = '" + VENDOR + '\'' +
                '.';
    }

    public static void main(String[] args) {
        HardDisc hardDisc = new HardDisc(HardDiscTypes.SSD, 1000, 1057.0);
        Keyboard keyboard = new Keyboard(KeyboardTypes.BLUETOOTH, Illumination.PROGRAMMABLE, 345.0);
        Procesor procesor = new Procesor(Frequency.MID, NumberOfCores.EIGHT, ProcessorManufacturer.AMD, 232.5);
        Ram ram = new Ram(8, 100.0, RAMType.DDR4SDRAM);
        Screen screen = new Screen(32, ScreenTypes.IPS, 3500.0);
        Computer computer = new Computer(procesor, ram, hardDisc, screen, keyboard);
        System.out.println(computer);
    }

}
