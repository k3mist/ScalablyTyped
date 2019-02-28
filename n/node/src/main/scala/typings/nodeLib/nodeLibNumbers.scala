package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeLibNumbers {
  @js.native
  sealed trait `-1`
    extends nodeLib.ttyMod.Direction
  
  @js.native
  sealed trait `0`
    extends nodeLib.ttyMod.Direction
       with nodeLib.v8Mod.DoesZapCodeSpaceFlag
  
  @js.native
  sealed trait `1`
    extends nodeLib.ttyMod.Direction
       with nodeLib.v8Mod.DoesZapCodeSpaceFlag
  
  @js.native
  sealed trait `false` extends js.Object
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

