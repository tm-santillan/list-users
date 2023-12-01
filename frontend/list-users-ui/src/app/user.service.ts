import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private api = 'http://localhost:8080/api/users'; // Fake API endpoint

  constructor(private http: HttpClient) { }

  getUsers(page: number): Observable<Response> {
    const params = { page: page.toString() }; // Define the page parameter

    return this.http.get<Response>(this.api, { params });
  }

}

class Response{
  page: any;
  per_page: any;
  total: any;
  total_pages: any;
  data!: [];
}