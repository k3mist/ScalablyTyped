package typings
package apolloDashCacheDashControlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheHint extends js.Object {
  var cacheHint: apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheHint
  def setCacheHint(hint: apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheHint): scala.Unit
}

object Anon_CacheHint {
  @scala.inline
  def apply(
    cacheHint: apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheHint,
    setCacheHint: js.Function1[apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheHint, scala.Unit]
  ): Anon_CacheHint = {
    val __obj = js.Dynamic.literal(cacheHint = cacheHint, setCacheHint = setCacheHint)
  
    __obj.asInstanceOf[Anon_CacheHint]
  }
}

