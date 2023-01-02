import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';
import { AppController } from './controller/app.controller';
import { Address } from './entity/address.entity';
import { BaseCode } from './entity/base-code.entity';
import { District } from './entity/district.entity';
import { Management } from './entity/management.entity';
import { ParkingArea } from './entity/parking-area.entity';
import { PayMethod } from './entity/pay-method.entity';
import { Reservation } from './entity/reservation.entity';
import { Ticket } from './entity/ticket.entity';
import { TimeTable } from './entity/time-table.entity';
import { User } from './entity/user.entity';
import { AppService } from './service/app.service';

@Module({
  imports: [
    TypeOrmModule.forRoot({
      type: 'mariadb',
      host: process.env.DB_HOST,
      port: parseInt(process.env.DB_PORT),
      username: process.env.DB_USER,
      password: process.env.DB_PWD,
      database: process.env.DB_DATABASE,
      entities: [BaseCode, User, District, Management, ParkingArea, Address, PayMethod, TimeTable, Ticket, Reservation],
      synchronize: false,
    })
  ],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
