package interfaceDemo;

public class InterfaceMain {
  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.open();
    Mouse mouse = new Mouse();
    computer.useUsb(mouse);
    Keyboard keyboard = new Keyboard();
    computer.useUsb(keyboard);
    computer.close();
  }
}
