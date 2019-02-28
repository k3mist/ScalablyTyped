package typings
package ecmarkupLib.libSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  var namespace: java.lang.String
  var opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Options */ js.Any
  var rootDir: java.lang.String
  var rootPath: java.lang.String
  var spec: this.type
  def exportBiblio(): js.Any
  def toHTML(): java.lang.String
}

