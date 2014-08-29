package se.citerus.cqrs.bookstore.shopping.web.transport;

import se.citerus.cqrs.bookstore.TransportObject;

import javax.validation.constraints.NotNull;

public class CreateCartRequest extends TransportObject {

  @NotNull
  public String cartId;

}