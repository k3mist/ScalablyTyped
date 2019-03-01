package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPolicy extends js.Object {
  /** The policy all_values state. */
  var allValues: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of values allowed  at this resource. Can only be set if no values
    * are set for `denied_values` and `all_values` is set to
    * `ALL_VALUES_UNSPECIFIED`.
    */
  var allowedValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * List of values denied at this resource. Can only be set if no values are
    * set for `allowed_values` and `all_values` is set to
    * `ALL_VALUES_UNSPECIFIED`.
    */
  var deniedValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Determines the inheritance behavior for this `Policy`.
    *
    * By default, a `ListPolicy` set at a resource supercedes any `Policy` set
    * anywhere up the resource hierarchy. However, if `inherit_from_parent` is
    * set to `true`, then the values from the effective `Policy` of the parent
    * resource are inherited, meaning the values set in this `Policy` are
    * added to the values inherited up the hierarchy.
    *
    * Setting `Policy` hierarchies that inherit both allowed values and denied
    * values isn't recommended in most circumstances to keep the configuration
    * simple and understandable. However, it is possible to set a `Policy` with
    * `allowed_values` set that inherits a `Policy` with `denied_values` set.
    * In this case, the values that are allowed must be in `allowed_values` and
    * not present in `denied_values`.
    *
    * For example, suppose you have a `Constraint`
    * `constraints/serviceuser.services`, which has a `constraint_type` of
    * `list_constraint`, and with `constraint_default` set to `ALLOW`.
    * Suppose that at the Organization level, a `Policy` is applied that
    * restricts the allowed API activations to {`E1`, `E2`}. Then, if a
    * `Policy` is applied to a project below the Organization that has
    * `inherit_from_parent` set to `false` and field all_values set to DENY,
    * then an attempt to activate any API will be denied.
    *
    * The following examples demonstrate different possible layerings:
    *
    * Example 1 (no inherited values):
    * `organizations/foo` has a `Policy` with values:
    * {allowed_values: “E1” allowed_values:”E2”}
    * ``projects/bar`` has `inherit_from_parent` `false` and values:
    * {allowed_values: "E3" allowed_values: "E4"}
    * The accepted values at `organizations/foo` are `E1`, `E2`.
    * The accepted values at `projects/bar` are `E3`, and `E4`.
    *
    * Example 2 (inherited values):
    * `organizations/foo` has a `Policy` with values:
    * {allowed_values: “E1” allowed_values:”E2”}
    * `projects/bar` has a `Policy` with values:
    * {value: “E3” value: ”E4” inherit_from_parent: true}
    * The accepted values at `organizations/foo` are `E1`, `E2`.
    * The accepted values at `projects/bar` are `E1`, `E2`, `E3`, and `E4`.
    *
    * Example 3 (inheriting both allowed and denied values):
    * `organizations/foo` has a `Policy` with values:
    * {allowed_values: "E1" allowed_values: "E2"}
    * `projects/bar` has a `Policy` with:
    * {denied_values: "E1"}
    * The accepted values at `organizations/foo` are `E1`, `E2`.
    * The value accepted at `projects/bar` is `E2`.
    *
    * Example 4 (RestoreDefault):
    * `organizations/foo` has a `Policy` with values:
    * {allowed_values: “E1” allowed_values:”E2”}
    * `projects/bar` has a `Policy` with values:
    * {RestoreDefault: {}}
    * The accepted values at `organizations/foo` are `E1`, `E2`.
    * The accepted values at `projects/bar` are either all or none depending on
    * the value of `constraint_default` (if `ALLOW`, all; if
    * `DENY`, none).
    *
    * Example 5 (no policy inherits parent policy):
    * `organizations/foo` has no `Policy` set.
    * `projects/bar` has no `Policy` set.
    * The accepted values at both levels are either all or none depending on
    * the value of `constraint_default` (if `ALLOW`, all; if
    * `DENY`, none).
    *
    * Example 6 (ListConstraint allowing all):
    * `organizations/foo` has a `Policy` with values:
    * {allowed_values: “E1” allowed_values: ”E2”}
    * `projects/bar` has a `Policy` with:
    * {all: ALLOW}
    * The accepted values at `organizations/foo` are `E1`, E2`.
    * Any value is accepted at `projects/bar`.
    *
    * Example 7 (ListConstraint allowing none):
    * `organizations/foo` has a `Policy` with values:
    * {allowed_values: “E1” allowed_values: ”E2”}
    * `projects/bar` has a `Policy` with:
    * {all: DENY}
    * The accepted values at `organizations/foo` are `E1`, E2`.
    * No value is accepted at `projects/bar`.
    */
  var inheritFromParent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. The Google Cloud Console will try to default to a configuration
    * that matches the value specified in this `Policy`. If `suggested_value`
    * is not set, it will inherit the value specified higher in the hierarchy,
    * unless `inherit_from_parent` is `false`.
    */
  var suggestedValue: js.UndefOr[java.lang.String] = js.undefined
}

object ListPolicy {
  @scala.inline
  def apply(
    allValues: java.lang.String = null,
    allowedValues: js.Array[java.lang.String] = null,
    deniedValues: js.Array[java.lang.String] = null,
    inheritFromParent: js.UndefOr[scala.Boolean] = js.undefined,
    suggestedValue: java.lang.String = null
  ): ListPolicy = {
    val __obj = js.Dynamic.literal()
    if (allValues != null) __obj.updateDynamic("allValues")(allValues)
    if (allowedValues != null) __obj.updateDynamic("allowedValues")(allowedValues)
    if (deniedValues != null) __obj.updateDynamic("deniedValues")(deniedValues)
    if (!js.isUndefined(inheritFromParent)) __obj.updateDynamic("inheritFromParent")(inheritFromParent)
    if (suggestedValue != null) __obj.updateDynamic("suggestedValue")(suggestedValue)
    __obj.asInstanceOf[ListPolicy]
  }
}

