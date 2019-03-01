package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A map of functions which accept a path and an origin point as parameters.
  */
trait IPathOriginFunctionMap
  extends /**
  * Key is the type of a path, value is a function which accepts a path object a point object as its parameters.
  */
/* type */ org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* id */ java.lang.String, 
        /* pathValue */ IPath, 
        /* origin */ IPoint, 
        /* layer */ java.lang.String, 
        scala.Unit
      ]
    ]

object IPathOriginFunctionMap {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Key is the type of a path, value is a function which accepts a path object a point object as its parameters.
    */
  /* type */ org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* id */ java.lang.String, 
        /* pathValue */ IPath, 
        /* origin */ IPoint, 
        /* layer */ java.lang.String, 
        scala.Unit
      ]
    ] = null
  ): IPathOriginFunctionMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IPathOriginFunctionMap]
  }
}

