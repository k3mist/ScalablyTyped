package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): TypeFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): TypeFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): TypeFilter
  /*
    Returns the filter object.
    */
  def toJSON(): TypeFilter
  /*
    Sets the type
    */
  def `type`(`type`: java.lang.String): TypeFilter
}

object TypeFilter {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cache: scala.Boolean => TypeFilter,
    cacheKey: java.lang.String => TypeFilter,
    name: java.lang.String => TypeFilter,
    toJSON: () => TypeFilter,
    `type`: java.lang.String => TypeFilter
  ): TypeFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), name = js.Any.fromFunction1(name), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[TypeFilter]
  }
}

