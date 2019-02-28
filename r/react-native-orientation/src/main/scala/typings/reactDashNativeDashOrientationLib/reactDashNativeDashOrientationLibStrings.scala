package typings
package reactDashNativeDashOrientationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashNativeDashOrientationLibStrings {
  @js.native
  sealed trait LANDSCAPE
    extends reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.orientation
  
  @js.native
  sealed trait `LANDSCAPE-LEFT`
    extends reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.specificOrientation
  
  @js.native
  sealed trait `LANDSCAPE-RIGHT`
    extends reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.specificOrientation
  
  @js.native
  sealed trait PORTRAIT
    extends reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.orientation
       with reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.specificOrientation
  
  @js.native
  sealed trait PORTRAITUPSIDEDOWN
    extends reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.orientation
       with reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.specificOrientation
  
  @js.native
  sealed trait UNKNOWN
    extends reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.orientation
       with reactDashNativeDashOrientationLib.reactDashNativeDashOrientationMod.OrientationNs.specificOrientation
  
  @scala.inline
  def LANDSCAPE: LANDSCAPE = "LANDSCAPE".asInstanceOf[LANDSCAPE]
  @scala.inline
  def `LANDSCAPE-LEFT`: `LANDSCAPE-LEFT` = "LANDSCAPE-LEFT".asInstanceOf[`LANDSCAPE-LEFT`]
  @scala.inline
  def `LANDSCAPE-RIGHT`: `LANDSCAPE-RIGHT` = "LANDSCAPE-RIGHT".asInstanceOf[`LANDSCAPE-RIGHT`]
  @scala.inline
  def PORTRAIT: PORTRAIT = "PORTRAIT".asInstanceOf[PORTRAIT]
  @scala.inline
  def PORTRAITUPSIDEDOWN: PORTRAITUPSIDEDOWN = "PORTRAITUPSIDEDOWN".asInstanceOf[PORTRAITUPSIDEDOWN]
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
}

