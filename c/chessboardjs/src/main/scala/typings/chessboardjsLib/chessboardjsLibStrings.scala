package typings
package chessboardjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object chessboardjsLibStrings {
  @js.native
  sealed trait BoardPositionType extends js.Object
  
  @js.native
  sealed trait black
    extends chessboardjsLib.chessboardjsMod.OrientationType
  
  @js.native
  sealed trait fast
    extends chessboardjsLib.chessboardjsMod.SpeedType
  
  @js.native
  sealed trait fen extends js.Object
  
  @js.native
  sealed trait flip extends js.Object
  
  @js.native
  sealed trait slow
    extends chessboardjsLib.chessboardjsMod.SpeedType
  
  @js.native
  sealed trait snapback
    extends chessboardjsLib.chessboardjsMod.DropOffBoardType
  
  @js.native
  sealed trait start extends js.Object
  
  @js.native
  sealed trait trash
    extends chessboardjsLib.chessboardjsMod.DropOffBoardType
  
  @js.native
  sealed trait white
    extends chessboardjsLib.chessboardjsMod.OrientationType
  
  @scala.inline
  def BoardPositionType: BoardPositionType = "BoardPositionType".asInstanceOf[BoardPositionType]
  @scala.inline
  def black: black = "black".asInstanceOf[black]
  @scala.inline
  def fast: fast = "fast".asInstanceOf[fast]
  @scala.inline
  def fen: fen = "fen".asInstanceOf[fen]
  @scala.inline
  def flip: flip = "flip".asInstanceOf[flip]
  @scala.inline
  def slow: slow = "slow".asInstanceOf[slow]
  @scala.inline
  def snapback: snapback = "snapback".asInstanceOf[snapback]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def trash: trash = "trash".asInstanceOf[trash]
  @scala.inline
  def white: white = "white".asInstanceOf[white]
}

