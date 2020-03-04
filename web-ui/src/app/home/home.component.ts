import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HomeService } from '../home.service'
import { User } from '../user';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  user: User;

  constructor(private route: ActivatedRoute,
    private router: Router,
    private homeservice: HomeService) {
    this.user = new User();
  }

  onSubmit() {
    this.homeservice.convertCurrencyToWord(this.user).subscribe(result => { this.user.name = result.name; this.user.currency = result.currency; this.user.currencyInWords = result.currencyInWords })
  }

  ngOnInit(): void {
  }

}
