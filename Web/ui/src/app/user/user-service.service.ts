import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/user';
import { Observable } from 'rxjs/Observable';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  private currencyConvertURL: String
  constructor() {
  	this.currencyConvertURL: 'http://localhost:8080/convert'
  }
  
  public convert(user:User) {
    return this.http.get<User>(this.usersUrl,{params:{name: user.name,currency: user.currency}});
  }
  
}
