package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  /**
  		 *
  		 * @param src
  		 * @param next
  		 */
  def setSource(
    src: videoDotJsLib.videoDotJsMod.videojsNs.TechNs.SourceObject,
    next: js.Function2[
      /* err */ js.Any, 
      /* next */ js.Function1[/* src */ videoDotJsLib.videoDotJsMod.videojsNs.TechNs.SourceObject, scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit
}

