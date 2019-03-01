package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCommandEventArgs[T /* <: SlickData */] extends js.Object {
  var button: HeaderButton
  var column: Column[T]
  var command: java.lang.String
  var grid: Grid[T]
}

object OnCommandEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](button: HeaderButton, column: Column[T], command: java.lang.String, grid: Grid[T]): OnCommandEventArgs[T] = {
    val __obj = js.Dynamic.literal(button = button, column = column, command = command, grid = grid)
  
    __obj.asInstanceOf[OnCommandEventArgs[T]]
  }
}

