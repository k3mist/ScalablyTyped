package typings
package eggDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  var cache: scala.Boolean
  var defaultExtension: java.lang.String
  var defaultViewEngine: java.lang.String
  var mapping: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PlainObject<string> */ js.Any
  var root: java.lang.String
}

object Anon_Cache {
  @scala.inline
  def apply(
    cache: scala.Boolean,
    defaultExtension: java.lang.String,
    defaultViewEngine: java.lang.String,
    mapping: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PlainObject<string> */ js.Any,
    root: java.lang.String
  ): Anon_Cache = {
    val __obj = js.Dynamic.literal(cache = cache, defaultExtension = defaultExtension, defaultViewEngine = defaultViewEngine, mapping = mapping, root = root)
  
    __obj.asInstanceOf[Anon_Cache]
  }
}

