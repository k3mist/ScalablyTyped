package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefixQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value of the Query.
    */
  def boost(boost: scala.Double): PrefixQuery
  /*
    The field to run the query against.
    */
  def field(f: java.lang.String): PrefixQuery
  /*
    Sets rewrite method.  Valid values are:
    constant_score_auto - tries to pick the best constant-score rewrite
    method based on term and document counts from the query
    scoring_boolean - translates each term into boolean should and
    keeps the scores as computed by the query
    constant_score_boolean - same as scoring_boolean, expect no scores
    are computed.
    constant_score_filter - first creates a private Filter, by visiting
    each term in sequence and marking all docs for that term
    top_terms_boost_N - first translates each term into boolean should
    and scores are only computed as the boost using the top N
    scoring terms.  Replace N with an integer value.
    top_terms_N -   first translates each term into boolean should
    and keeps the scores as computed by the query. Only the top N
    scoring terms are used.  Replace N with an integer value.
    Default is constant_score_auto.
    This is an advanced option, use with care.
    */
  def rewrite(m: java.lang.String): PrefixQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    The prefix value.
    */
  def value(p: java.lang.String): PrefixQuery
}

object PrefixQuery {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    boost: js.Function1[scala.Double, PrefixQuery],
    field: js.Function1[java.lang.String, PrefixQuery],
    rewrite: js.Function1[java.lang.String, PrefixQuery],
    toJSON: js.Function0[js.Any],
    value: js.Function1[java.lang.String, PrefixQuery]
  ): PrefixQuery = {
    val __obj = js.Dynamic.literal(_type = _type, boost = boost, field = field, rewrite = rewrite, toJSON = toJSON, value = value)
  
    __obj.asInstanceOf[PrefixQuery]
  }
}

