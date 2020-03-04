import { HttpClient } from '@angular/common/http' 
import { Injectable } from '@angular/core';
import { User } from './user'

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  constructor(private http : HttpClient) {

  }

  convertCurrencyToWord(user : User){
    return this.http.post<User>('http://localhost:8080/convert',user);
  }
}
