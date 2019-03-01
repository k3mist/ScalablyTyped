package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionResolver extends js.Object {
  /**
    * Extracts the partition key from the specified document using the partitionKeyExtractor
    * @param document - The document from which to extract the partition key.
    */
  def getPartitionKey(document: js.Any): java.lang.String
  /**
    * Given a partition key, returns the correct collection link for creating a document.
    * @param partitionKey - The partition key used to determine the target collection for create
    */
  def resolveForCreate(partitionKey: java.lang.String): java.lang.String
  /**
    * Given a partition key, returns a list of collection links to read from.
    * @param partitionKey - The partition key used to determine the target collection for query
    */
  def resolveForRead(partitionKey: js.Any): js.Array[java.lang.String]
}

object PartitionResolver {
  @scala.inline
  def apply(
    getPartitionKey: js.Function1[js.Any, java.lang.String],
    resolveForCreate: js.Function1[java.lang.String, java.lang.String],
    resolveForRead: js.Function1[js.Any, js.Array[java.lang.String]]
  ): PartitionResolver = {
    val __obj = js.Dynamic.literal(getPartitionKey = getPartitionKey, resolveForCreate = resolveForCreate, resolveForRead = resolveForRead)
  
    __obj.asInstanceOf[PartitionResolver]
  }
}

