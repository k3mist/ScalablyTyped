package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expr extends js.Object {
  /**
    * An optional description of the expression. This is a longer text which
    * describes the expression, e.g. when hovered over it in a UI.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Textual representation of an expression in
    * Common Expression Language syntax.
    *
    * The application context of the containing message determines which
    * well-known feature set of CEL is supported.
    */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An optional string indicating the location of the expression for error
    * reporting, e.g. a file name and a position in the file.
    */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An optional title for the expression, i.e. a short string describing
    * its purpose. This can be used e.g. in UIs which allow to enter the
    * expression.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Expr {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    expression: java.lang.String = null,
    location: java.lang.String = null,
    title: java.lang.String = null
  ): Expr = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (location != null) __obj.updateDynamic("location")(location)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Expr]
  }
}

