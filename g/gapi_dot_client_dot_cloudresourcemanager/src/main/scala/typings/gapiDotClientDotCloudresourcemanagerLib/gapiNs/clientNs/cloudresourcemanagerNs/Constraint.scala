package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  /** Defines this constraint as being a BooleanConstraint. */
  var booleanConstraint: js.UndefOr[js.Any] = js.undefined
  /** The evaluation behavior of this constraint in the absense of 'Policy'. */
  var constraintDefault: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Detailed description of what this `Constraint` controls as well as how and
    * where it is enforced.
    *
    * Mutable.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The human readable name.
    *
    * Mutable.
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Defines this constraint as being a ListConstraint. */
  var listConstraint: js.UndefOr[ListConstraint] = js.undefined
  /**
    * Immutable value, required to globally be unique. For example,
    * `constraints/serviceuser.services`
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Version of the `Constraint`. Default version is 0; */
  var version: js.UndefOr[scala.Double] = js.undefined
}

object Constraint {
  @scala.inline
  def apply(
    booleanConstraint: js.Any = null,
    constraintDefault: java.lang.String = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    listConstraint: ListConstraint = null,
    name: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): Constraint = {
    val __obj = js.Dynamic.literal()
    if (booleanConstraint != null) __obj.updateDynamic("booleanConstraint")(booleanConstraint)
    if (constraintDefault != null) __obj.updateDynamic("constraintDefault")(constraintDefault)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (listConstraint != null) __obj.updateDynamic("listConstraint")(listConstraint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraint]
  }
}

