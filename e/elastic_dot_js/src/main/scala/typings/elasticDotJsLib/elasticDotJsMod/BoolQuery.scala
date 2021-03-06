package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "BoolQuery")
@js.native
/*
  A Query that matches documents matching boolean combinations of other
  queries, e.g. termQuerys, phraseQuerys or other boolQuerys.
  */
class BoolQuery ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoolQuery {
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets if the Query should be enhanced with a
    MatchAllQuery in order to act as a pure exclude when
    only negative (mustNot) clauses exist. Default: true.
    */
  /* CompleteClass */
  override def adjustPureNegative(trueFalse: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoolQuery = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoolQuery = js.native
  /*
    Enables or disables similarity coordinate scoring of documents
    matching the Query. Default: false.
    */
  /* CompleteClass */
  override def disableCoord(trueFalse: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoolQuery = js.native
  /*
    Sets the number of optional clauses that must match.
    By default no optional clauses are necessary for a match
    (unless there are no required clauses).  If this method is used,
    then the specified number of clauses is required.
    Use of this method is totally independent of specifying that
    any specific clauses are required (or prohibited).  This number will
    only be compared against the number of matching optional clauses.
    */
  /* CompleteClass */
  override def minimumNumberShouldMatch(minMatch: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoolQuery = js.native
  /*
    Adds query to boolean container. Given query "must" appear in matching documents.
    */
  /* CompleteClass */
  override def must(oQuery: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoolQuery = js.native
  /*
    Adds query to boolean container. Given query "must not" appear in matching documents.
    */
  /* CompleteClass */
  override def mustNot(oQuery: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoolQuery = js.native
  /*
    Adds query to boolean container. Given query "should" appear in matching documents.
    */
  /* CompleteClass */
  override def should(oQuery: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoolQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

