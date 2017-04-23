package de.htwg.se.sudoku

import de.htwg.se.sudoku.model.{Grid, GridCreator, Player, Solver}
import de.htwg.se.sudoku.controller.Controller
import de.htwg.se.sudoku.aview.Tui

import scala.io.StdIn.readLine

object Sudoku {
  val controller = new Controller(new Grid(9))
  val tui = new Tui(controller)
  controller.notifyObservers

  def main(args: Array[String]): Unit = {
    var input: String = ""

    do {
      input = readLine()
      tui.processInputLine(input)
    } while (input != "q")
  }
}