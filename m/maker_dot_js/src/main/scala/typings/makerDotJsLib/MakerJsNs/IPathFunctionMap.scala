package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A map of functions which accept a path as a parameter.
  */
trait IPathFunctionMap
  extends /**
  * Key is the type of a path, value is a function which accepts a path object as its parameter.
  */
/* type */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* pathValue */ IPath, scala.Unit]]

object IPathFunctionMap {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Key is the type of a path, value is a function which accepts a path object as its parameter.
    */
  /* type */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* pathValue */ IPath, scala.Unit]] = null
  ): IPathFunctionMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IPathFunctionMap]
  }
}

