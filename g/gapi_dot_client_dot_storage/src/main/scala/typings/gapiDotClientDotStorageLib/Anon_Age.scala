package typings
package gapiDotClientDotStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Age extends js.Object {
  /** Age of an object (in days). This condition is satisfied when an object reaches the specified age. */
  var age: js.UndefOr[scala.Double] = js.undefined
  /**
    * A date in RFC 3339 format with only the date part (for instance, "2013-01-15"). This condition is satisfied when an object is created before midnight
    * of the specified date in UTC.
    */
  var createdBefore: js.UndefOr[java.lang.String] = js.undefined
  /** Relevant only for versioned objects. If the value is true, this condition matches live objects; if the value is false, it matches archived objects. */
  var isLive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Objects having any of the storage classes specified by this condition will be matched. Values include MULTI_REGIONAL, REGIONAL, NEARLINE, COLDLINE,
    * STANDARD, and DURABLE_REDUCED_AVAILABILITY.
    */
  var matchesStorageClass: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Relevant only for versioned objects. If the value is N, this condition is satisfied when there are at least N versions (including the live version)
    * newer than this version of the object.
    */
  var numNewerVersions: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Age {
  @scala.inline
  def apply(
    age: scala.Int | scala.Double = null,
    createdBefore: java.lang.String = null,
    isLive: js.UndefOr[scala.Boolean] = js.undefined,
    matchesStorageClass: js.Array[java.lang.String] = null,
    numNewerVersions: scala.Int | scala.Double = null
  ): Anon_Age = {
    val __obj = js.Dynamic.literal()
    if (age != null) __obj.updateDynamic("age")(age.asInstanceOf[js.Any])
    if (createdBefore != null) __obj.updateDynamic("createdBefore")(createdBefore)
    if (!js.isUndefined(isLive)) __obj.updateDynamic("isLive")(isLive)
    if (matchesStorageClass != null) __obj.updateDynamic("matchesStorageClass")(matchesStorageClass)
    if (numNewerVersions != null) __obj.updateDynamic("numNewerVersions")(numNewerVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Age]
  }
}

