package examples

import chisel3._
import chisel3.iotesters.PeekPokeTester

class AdderTest(c: Adder) extends PeekPokeTester(c) {
    poke(c.io.in0, 1)
    poke(c.io.in1, 2)
    step(1)
    expect(c.io.out, 3)
}

object AdderTest extends App {
  println("[TEST] Adder")
  iotesters.Driver.execute(Array[String](), () => new Adder()) {
    c => new AdderTest(c)
  }
}
