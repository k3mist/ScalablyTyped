package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryMixin extends js.Object {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): QueryMixin
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object QueryMixin {
  @scala.inline
  def apply(_type: () => java.lang.String, boost: scala.Double => QueryMixin, toJSON: () => js.Any): QueryMixin = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), boost = js.Any.fromFunction1(boost), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[QueryMixin]
  }
}

