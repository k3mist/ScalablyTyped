package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasChildQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): HasChildQuery
  /*
    Sets the query
    */
  def query(q: js.Object): HasChildQuery
  /*
    Sets the scope of the query.  A scope allows to run facets on the
    same scope name that will work against the child documents.
    */
  def scope(s: java.lang.String): HasChildQuery
  /*
    Sets the scoring method.  Valid values are:
    none - the default, no scoring
    max - the highest score of all matched child documents is used
    sum - the sum the all the matched child documents is used
    avg - the average of all matched child documents is used
    */
  def scoreMode(s: java.lang.String): HasChildQuery
  /*
    Sets the scoring method.  Valid values are:
    none - the default, no scoring
    max - the highest score of all matched child documents is used
    sum - the sum the all the matched child documents is used
    avg - the average of all matched child documents is used
    */
  def scoreType(s: java.lang.String): HasChildQuery
  /*
    Sets the cutoff value to short circuit processing.
    */
  def shortCircuitCutoff(cutoff: scala.Double): HasChildQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    Sets the child document type to search against
    */
  def `type`(t: java.lang.String): HasChildQuery
}

object HasChildQuery {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    boost: js.Function1[scala.Double, HasChildQuery],
    query: js.Function1[js.Object, HasChildQuery],
    scope: js.Function1[java.lang.String, HasChildQuery],
    scoreMode: js.Function1[java.lang.String, HasChildQuery],
    scoreType: js.Function1[java.lang.String, HasChildQuery],
    shortCircuitCutoff: js.Function1[scala.Double, HasChildQuery],
    toJSON: js.Function0[js.Any],
    `type`: js.Function1[java.lang.String, HasChildQuery]
  ): HasChildQuery = {
    val __obj = js.Dynamic.literal(_type = _type, boost = boost, query = query, scope = scope, scoreMode = scoreMode, scoreType = scoreType, shortCircuitCutoff = shortCircuitCutoff, toJSON = toJSON, `type` = `type`)
  
    __obj.asInstanceOf[HasChildQuery]
  }
}

