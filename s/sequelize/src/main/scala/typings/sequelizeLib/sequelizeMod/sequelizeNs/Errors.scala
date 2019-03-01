package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sequelize provides a host of custom error classes, to allow you to do easier debugging. All of these errors
  * are exposed on the sequelize object and the sequelize constructor. All sequelize errors inherit from the
  * base JS error object.
  */
trait Errors extends js.Object {
  var AccessDeniedError: AccessDeniedError
  var ConnectionError: ConnectionError
  var ConnectionRefusedError: ConnectionRefusedError
  var ConnectionTimedOutError: ConnectionTimedOutError
  var DatabaseError: DatabaseError
  var EmptyResultError: EmptyResultError
  var Error: BaseError
  var ExclusionConstraintError: ExclusionConstraintError
  var ForeignKeyConstraintError: ForeignKeyConstraintError
  var HostNotFoundError: HostNotFoundError
  var HostNotReachableError: HostNotReachableError
  var InvalidConnectionError: InvalidConnectionError
  var TimeoutError: TimeoutError
  var UniqueConstraintError: UniqueConstraintError
  var ValidationError: ValidationError
  var ValidationErrorItem: ValidationErrorItem
}

object Errors {
  @scala.inline
  def apply(
    AccessDeniedError: AccessDeniedError,
    ConnectionError: ConnectionError,
    ConnectionRefusedError: ConnectionRefusedError,
    ConnectionTimedOutError: ConnectionTimedOutError,
    DatabaseError: DatabaseError,
    EmptyResultError: EmptyResultError,
    Error: BaseError,
    ExclusionConstraintError: ExclusionConstraintError,
    ForeignKeyConstraintError: ForeignKeyConstraintError,
    HostNotFoundError: HostNotFoundError,
    HostNotReachableError: HostNotReachableError,
    InvalidConnectionError: InvalidConnectionError,
    TimeoutError: TimeoutError,
    UniqueConstraintError: UniqueConstraintError,
    ValidationError: ValidationError,
    ValidationErrorItem: ValidationErrorItem
  ): Errors = {
    val __obj = js.Dynamic.literal(AccessDeniedError = AccessDeniedError, ConnectionError = ConnectionError, ConnectionRefusedError = ConnectionRefusedError, ConnectionTimedOutError = ConnectionTimedOutError, DatabaseError = DatabaseError, EmptyResultError = EmptyResultError, Error = Error, ExclusionConstraintError = ExclusionConstraintError, ForeignKeyConstraintError = ForeignKeyConstraintError, HostNotFoundError = HostNotFoundError, HostNotReachableError = HostNotReachableError, InvalidConnectionError = InvalidConnectionError, TimeoutError = TimeoutError, UniqueConstraintError = UniqueConstraintError, ValidationError = ValidationError, ValidationErrorItem = ValidationErrorItem)
  
    __obj.asInstanceOf[Errors]
  }
}

