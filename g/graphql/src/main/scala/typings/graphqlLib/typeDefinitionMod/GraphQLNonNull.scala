package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-Null Modifier
  *
  * A non-null is a kind of type marker, a wrapping type which points to another
  * type. Non-null types enforce that their values are never null and can ensure
  * an error is raised if this ever occurs during a request. It is useful for
  * fields which you can make a strong guarantee on non-nullability, for example
  * usually the id field of a database row will never be null.
  *
  * Example:
  *
  *     const RowType = new GraphQLObjectType({
  *       name: 'Row',
  *       fields: () => ({
  *         id: { type: new GraphQLNonNull(GraphQLString) },
  *       })
  *     })
  *
  * Note: the enforcement of non-nullability occurs within the executor.
  */
trait GraphQLNonNull[T /* <: GraphQLNullableType */] extends js.Object {
  val ofType: T
  def inspect(): java.lang.String
  def toJSON(): java.lang.String
}

object GraphQLNonNull {
  @scala.inline
  def apply[T /* <: GraphQLNullableType */](
    inspect: js.Function0[java.lang.String],
    ofType: T,
    toJSON: js.Function0[java.lang.String],
    toString: js.Function0[java.lang.String]
  ): GraphQLNonNull[T] = {
    val __obj = js.Dynamic.literal(inspect = inspect, ofType = ofType.asInstanceOf[js.Any], toJSON = toJSON, toString = toString)
  
    __obj.asInstanceOf[GraphQLNonNull[T]]
  }
}

