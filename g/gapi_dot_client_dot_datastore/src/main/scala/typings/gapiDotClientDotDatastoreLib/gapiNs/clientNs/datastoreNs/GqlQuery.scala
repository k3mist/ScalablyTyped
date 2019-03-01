package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GqlQuery extends js.Object {
  /**
    * When false, the query string must not contain any literals and instead must
    * bind all values. For example,
    * `SELECT &#42; FROM Kind WHERE a = 'string literal'` is not allowed, while
    * `SELECT &#42; FROM Kind WHERE a = @value` is.
    */
  var allowLiterals: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For each non-reserved named binding site in the query string, there must be
    * a named parameter with that name, but not necessarily the inverse.
    *
    * Key must match regex `A-Za-z_$&#42;`, must not match regex
    * `__.&#42;__`, and must not be `""`.
    */
  var namedBindings: js.UndefOr[stdLib.Record[java.lang.String, GqlQueryParameter]] = js.undefined
  /**
    * Numbered binding site @1 references the first numbered parameter,
    * effectively using 1-based indexing, rather than the usual 0.
    *
    * For each binding site numbered i in `query_string`, there must be an i-th
    * numbered parameter. The inverse must also be true.
    */
  var positionalBindings: js.UndefOr[js.Array[GqlQueryParameter]] = js.undefined
  /**
    * A string of the format described
    * [here](https://cloud.google.com/datastore/docs/apis/gql/gql_reference).
    */
  var queryString: js.UndefOr[java.lang.String] = js.undefined
}

object GqlQuery {
  @scala.inline
  def apply(
    allowLiterals: js.UndefOr[scala.Boolean] = js.undefined,
    namedBindings: stdLib.Record[java.lang.String, GqlQueryParameter] = null,
    positionalBindings: js.Array[GqlQueryParameter] = null,
    queryString: java.lang.String = null
  ): GqlQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLiterals)) __obj.updateDynamic("allowLiterals")(allowLiterals)
    if (namedBindings != null) __obj.updateDynamic("namedBindings")(namedBindings)
    if (positionalBindings != null) __obj.updateDynamic("positionalBindings")(positionalBindings)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    __obj.asInstanceOf[GqlQuery]
  }
}

